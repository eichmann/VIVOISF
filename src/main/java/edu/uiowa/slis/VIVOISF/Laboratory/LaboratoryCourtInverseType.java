package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryCourtInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryCourtInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryCourtInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryCourtInverseIterator theLaboratoryCourtInverseIterator = (LaboratoryCourtInverseIterator)findAncestorWithClass(this, LaboratoryCourtInverseIterator.class);
			pageContext.getOut().print(theLaboratoryCourtInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for court tag ");
		}
		return SKIP_BODY;
	}
}

