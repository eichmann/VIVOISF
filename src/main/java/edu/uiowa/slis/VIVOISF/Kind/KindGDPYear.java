package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(KindGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindGDPYearIterator theKind = (KindGDPYearIterator)findAncestorWithClass(this, KindGDPYearIterator.class);
			pageContext.getOut().print(theKind.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

