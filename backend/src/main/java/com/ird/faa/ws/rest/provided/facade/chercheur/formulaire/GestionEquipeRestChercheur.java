package com.ird.faa.ws.rest.provided.facade.chercheur.formulaire;

import com.ird.faa.service.chercheur.facade.formulaire.GestionEquipeChercheurService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.ird.faa.bean.formulaire.GestionEquipe;
import com.ird.faa.ws.rest.provided.converter.GestionEquipeConverter;
import com.ird.faa.ws.rest.provided.vo.GestionEquipeVo;

@Api("Manages gestionEquipe services")
@RestController
@RequestMapping("api/chercheur/gestionEquipe")
public class GestionEquipeRestChercheur {

@Autowired
private GestionEquipeChercheurService gestionEquipeService;

@Autowired
private GestionEquipeConverter gestionEquipeConverter;


            @ApiOperation("Updates the specified  gestionEquipe")
            @PutMapping("/")
            public  GestionEquipeVo update(@RequestBody  GestionEquipeVo  gestionEquipeVo){
            GestionEquipe gestionEquipe = gestionEquipeConverter.toItem(gestionEquipeVo);
            gestionEquipe = gestionEquipeService.update(gestionEquipe);
            return gestionEquipeConverter.toVo(gestionEquipe);
            }

    @ApiOperation("Finds a list of all gestionEquipes")
    @GetMapping("/")
    public List<GestionEquipeVo> findAll(){
        return gestionEquipeConverter.toVo(gestionEquipeService.findAll());
    }
    
    
    @ApiOperation("Finds a list of all gestionEquipes")
    @GetMapping("/orderByAnneeDesc")
    public List<GestionEquipeVo> findAllByOrderByAnneeDesc(){
        return gestionEquipeConverter.toVo(gestionEquipeService.findAllByOrderByAnneeDesc());
    }

    
    
    
    
    
    
    @ApiOperation("Finds a gestionEquipe with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public GestionEquipeVo findByIdWithAssociatedList(@PathVariable Long id){
    return gestionEquipeConverter.toVo(gestionEquipeService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search gestionEquipe by a specific criteria")
    @PostMapping("/search")
    public List<GestionEquipeVo> findByCriteria(@RequestBody GestionEquipeVo gestionEquipeVo){
        return gestionEquipeConverter.toVo(gestionEquipeService.findByCriteria(gestionEquipeVo));
        }

            @ApiOperation("Finds a gestionEquipe by id")
            @GetMapping("/id/{id}")
            public GestionEquipeVo findById(@PathVariable Long id){
            return gestionEquipeConverter.toVo(gestionEquipeService.findById(id));
            }

            @ApiOperation("Saves the specified  gestionEquipe")
            @PostMapping("/")
            public GestionEquipeVo save(@RequestBody GestionEquipeVo gestionEquipeVo){
            GestionEquipe gestionEquipe = gestionEquipeConverter.toItem(gestionEquipeVo);
            gestionEquipe = gestionEquipeService.save(gestionEquipe);
            return gestionEquipeConverter.toVo(gestionEquipe);
            }

            @ApiOperation("Delete the specified gestionEquipe")
            @DeleteMapping("/")
            public int delete(@RequestBody GestionEquipeVo gestionEquipeVo){
            GestionEquipe gestionEquipe = gestionEquipeConverter.toItem(gestionEquipeVo);
            return gestionEquipeService.delete(gestionEquipe);
            }

            @ApiOperation("Deletes a gestionEquipe by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return gestionEquipeService.deleteById(id);
            }


            @GetMapping("/username/{username}/id/{compagneId}")
            public List<GestionEquipeVo> findByChercheurUsernameAndCampagneId(@PathVariable String username,@PathVariable Long compagneId){
            return gestionEquipeConverter.toVo(gestionEquipeService.findByChercheurUsernameAndCampagneId(username,compagneId));
            }
        }
