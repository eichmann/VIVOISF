package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryDirectorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryDirectorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryDirectorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryDirectorInverseIterator theLaboratoryDirectorInverseIterator = (LaboratoryDirectorInverseIterator)findAncestorWithClass(this, LaboratoryDirectorInverseIterator.class);
			pageContext.getOut().print(theLaboratoryDirectorInverseIterator.getDirectorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for director tag ");
		}
		return SKIP_BODY;
	}
}

