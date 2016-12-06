package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRolePlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRolePlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRolePlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRole theResearcherRole = (ResearcherRole)findAncestorWithClass(this, ResearcherRole.class);
			if (!theResearcherRole.commitNeeded) {
				pageContext.getOut().print(theResearcherRole.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			ResearcherRole theResearcherRole = (ResearcherRole)findAncestorWithClass(this, ResearcherRole.class);
			return theResearcherRole.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing ResearcherRole for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			ResearcherRole theResearcherRole = (ResearcherRole)findAncestorWithClass(this, ResearcherRole.class);
			theResearcherRole.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for placeOfPublication tag ");
		}
	}
}

