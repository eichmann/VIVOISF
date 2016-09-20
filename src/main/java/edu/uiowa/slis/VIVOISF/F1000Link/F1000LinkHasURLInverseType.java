package edu.uiowa.slis.VIVOISF.F1000Link;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class F1000LinkHasURLInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static F1000LinkHasURLInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(F1000LinkHasURLInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			F1000LinkHasURLInverseIterator theF1000LinkHasURLInverseIterator = (F1000LinkHasURLInverseIterator)findAncestorWithClass(this, F1000LinkHasURLInverseIterator.class);
			pageContext.getOut().print(theF1000LinkHasURLInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing F1000Link for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing F1000Link for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

