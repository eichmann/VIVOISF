package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryCourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryCourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryCourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryCourtInverseIterator theLaboratoryCourtInverseIterator = (LaboratoryCourtInverseIterator)findAncestorWithClass(this, LaboratoryCourtInverseIterator.class);
			pageContext.getOut().print(theLaboratoryCourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for court tag ");
		}
		return SKIP_BODY;
	}
}

