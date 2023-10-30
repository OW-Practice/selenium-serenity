//package CuraHealthScreenplayProject;
//
//import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;
//
//import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Question;
//import net.serenitybdd.screenplay.targets.Target;;
//
//public class GetPageTitle implements Question<String>{
//	
//	private Target targetname;
//	
//	public GetPageTitle(Target targetname) {
//		this.targetname=targetname;
//	}
//
//	@Override
//	public String answeredBy(Actor curahealth) {
//		return Text.of(targetname).viewedBy(curahealth).asString();
//	}
//	
//	public static Question<String> ofTarget(Target targetname){
//		return new GetPageTitle(targetname);
//	}
//
//}
