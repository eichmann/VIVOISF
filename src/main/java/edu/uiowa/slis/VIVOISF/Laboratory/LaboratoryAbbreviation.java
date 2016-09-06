package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Laboratory theLaboratory = (Laboratory)findAncestorWithClass(this, Laboratory.class);
			if (!theLaboratory.commitNeeded) {
				pageContext.getOut().print(theLaboratory.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Laboratory theLaboratory = (Laboratory)findAncestorWithClass(this, Laboratory.class);
			return theLaboratory.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Laboratory for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Laboratory theLaboratory = (Laboratory)findAncestorWithClass(this, Laboratory.class);
			theLaboratory.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for abbreviation tag ");
		}
	}
}

