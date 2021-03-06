package com.ird.faa.ws.rest.provided.facade.chercheur.referentiel;

import com.ird.faa.service.chercheur.facade.referentiel.MasterChercheurService;

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
import com.ird.faa.bean.referentiel.Master;
import com.ird.faa.ws.rest.provided.converter.MasterConverter;
import com.ird.faa.ws.rest.provided.vo.MasterVo;

@Api("Manages master services")
@RestController
@RequestMapping("api/chercheur/master")
public class MasterRestChercheur {

@Autowired
private MasterChercheurService masterService;

@Autowired
private MasterConverter masterConverter;


            @ApiOperation("Updates the specified  master")
            @PutMapping("/")
            public  MasterVo update(@RequestBody  MasterVo  masterVo){
            Master master = masterConverter.toItem(masterVo);
            master = masterService.update(master);
            return masterConverter.toVo(master);
            }

    @ApiOperation("Finds a list of all masters")
    @GetMapping("/")
    public List<MasterVo> findAll(){
        return masterConverter.toVo(masterService.findAll());
    }

    @ApiOperation("Finds a master with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public MasterVo findByIdWithAssociatedList(@PathVariable Long id){
    return masterConverter.toVo(masterService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search master by a specific criteria")
    @PostMapping("/search")
    public List<MasterVo> findByCriteria(@RequestBody MasterVo masterVo){
        return masterConverter.toVo(masterService.findByCriteria(masterVo));
        }

            @ApiOperation("Finds a master by id")
            @GetMapping("/id/{id}")
            public MasterVo findById(@PathVariable Long id){
            return masterConverter.toVo(masterService.findById(id));
            }

            @ApiOperation("Saves the specified  master")
            @PostMapping("/")
            public MasterVo save(@RequestBody MasterVo masterVo){
            Master master = masterConverter.toItem(masterVo);
            master = masterService.save(master);
            return masterConverter.toVo(master);
            }

            @ApiOperation("Delete the specified master")
            @DeleteMapping("/")
            public int delete(@RequestBody MasterVo masterVo){
            Master master = masterConverter.toItem(masterVo);
            return masterService.delete(master);
            }

            @ApiOperation("Deletes a master by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return masterService.deleteById(id);
            }


        }
