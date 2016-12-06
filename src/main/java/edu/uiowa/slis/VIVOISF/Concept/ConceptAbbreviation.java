package edu.uiowa.slis.VIVOISF.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConceptAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Concept theConcept = (Concept)findAncestorWithClass(this, Concept.class);
			if (!theConcept.commitNeeded) {
				pageContext.getOut().print(theConcept.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Concept theConcept = (Concept)findAncestorWithClass(this, Concept.class);
			return theConcept.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Concept for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Concept theConcept = (Concept)findAncestorWithClass(this, Concept.class);
			theConcept.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for abbreviation tag ");
		}
	}
}

