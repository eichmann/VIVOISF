package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(KindHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindHDITotalIterator theKind = (KindHDITotalIterator)findAncestorWithClass(this, KindHDITotalIterator.class);
			pageContext.getOut().print(theKind.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

