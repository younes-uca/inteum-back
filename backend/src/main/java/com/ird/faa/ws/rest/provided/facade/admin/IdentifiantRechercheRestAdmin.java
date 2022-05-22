package  com.ird.faa.ws.rest.provided.facade.admin;

import com.ird.faa.service.admin.facade.IdentifiantRechercheAdminService;

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
import com.ird.faa.bean.formulaire.IdentifiantRecherche;
import com.ird.faa.ws.rest.provided.converter.IdentifiantRechercheConverter;
import com.ird.faa.ws.rest.provided.vo.IdentifiantRechercheVo;

@Api("Manages identifiantRecherche services")
@RestController
@RequestMapping("api/admin/identifiantRecherche")
public class IdentifiantRechercheRestAdmin {

@Autowired
private IdentifiantRechercheAdminService identifiantRechercheService;

@Autowired
private IdentifiantRechercheConverter identifiantRechercheConverter;


            @ApiOperation("Updates the specified  identifiantRecherche")
            @PutMapping("/")
            public  IdentifiantRechercheVo update(@RequestBody  IdentifiantRechercheVo  identifiantRechercheVo){
            IdentifiantRecherche identifiantRecherche = identifiantRechercheConverter.toItem(identifiantRechercheVo);
            identifiantRecherche = identifiantRechercheService.update(identifiantRecherche);
            return identifiantRechercheConverter.toVo(identifiantRecherche);
            }

    @ApiOperation("Finds a list of all identifiantRecherches")
    @GetMapping("/")
    public List<IdentifiantRechercheVo> findAll(){
        return identifiantRechercheConverter.toVo(identifiantRechercheService.findAll());
    }

    @ApiOperation("Finds a identifiantRecherche with associated lists by id")
    @GetMapping("/detail/id/{id}")
    public IdentifiantRechercheVo findByIdWithAssociatedList(@PathVariable Long id){
    return identifiantRechercheConverter.toVo(identifiantRechercheService.findByIdWithAssociatedList(id));
    }

    @ApiOperation("Search identifiantRecherche by a specific criteria")
    @PostMapping("/search")
    public List<IdentifiantRechercheVo> findByCriteria(@RequestBody IdentifiantRechercheVo identifiantRechercheVo){
        return identifiantRechercheConverter.toVo(identifiantRechercheService.findByCriteria(identifiantRechercheVo));
        }

            @ApiOperation("Finds a identifiantRecherche by id")
            @GetMapping("/id/{id}")
            public IdentifiantRechercheVo findById(@PathVariable Long id){
            return identifiantRechercheConverter.toVo(identifiantRechercheService.findById(id));
            }

            @ApiOperation("Saves the specified  identifiantRecherche")
            @PostMapping("/")
            public IdentifiantRechercheVo save(@RequestBody IdentifiantRechercheVo identifiantRechercheVo){
            IdentifiantRecherche identifiantRecherche = identifiantRechercheConverter.toItem(identifiantRechercheVo);
            identifiantRecherche = identifiantRechercheService.save(identifiantRecherche);
            return identifiantRechercheConverter.toVo(identifiantRecherche);
            }

            @ApiOperation("Delete the specified identifiantRecherche")
            @DeleteMapping("/")
            public int delete(@RequestBody IdentifiantRechercheVo identifiantRechercheVo){
            IdentifiantRecherche identifiantRecherche = identifiantRechercheConverter.toItem(identifiantRechercheVo);
            return identifiantRechercheService.delete(identifiantRecherche);
            }

            @ApiOperation("Deletes a identifiantRecherche by id")
            @DeleteMapping("/id/{id}")
            public int deleteById(@PathVariable Long id){
            return identifiantRechercheService.deleteById(id);
            }


        }
