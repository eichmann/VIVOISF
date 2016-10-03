package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterCourtInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterCourtInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterCourtInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterCourtInverseIterator theCenterCourtInverseIterator = (CenterCourtInverseIterator)findAncestorWithClass(this, CenterCourtInverseIterator.class);
			pageContext.getOut().print(theCenterCourtInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for court tag ");
		}
		return SKIP_BODY;
	}
}

