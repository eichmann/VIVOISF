package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(KindHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindHDIYearIterator theKind = (KindHDIYearIterator)findAncestorWithClass(this, KindHDIYearIterator.class);
			pageContext.getOut().print(theKind.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

