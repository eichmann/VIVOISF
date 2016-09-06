package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratory theCoreLaboratory = (CoreLaboratory)findAncestorWithClass(this, CoreLaboratory.class);
			if (!theCoreLaboratory.commitNeeded) {
				pageContext.getOut().print(theCoreLaboratory.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			CoreLaboratory theCoreLaboratory = (CoreLaboratory)findAncestorWithClass(this, CoreLaboratory.class);
			return theCoreLaboratory.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing CoreLaboratory for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			CoreLaboratory theCoreLaboratory = (CoreLaboratory)findAncestorWithClass(this, CoreLaboratory.class);
			theCoreLaboratory.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for abbreviation tag ");
		}
	}
}

