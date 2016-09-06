package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Association theAssociation = (Association)findAncestorWithClass(this, Association.class);
			if (!theAssociation.commitNeeded) {
				pageContext.getOut().print(theAssociation.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Association for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Association theAssociation = (Association)findAncestorWithClass(this, Association.class);
			return theAssociation.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Association for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Association theAssociation = (Association)findAncestorWithClass(this, Association.class);
			theAssociation.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Association for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for abbreviation tag ");
		}
	}
}

