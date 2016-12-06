package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(KindAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindAgriculturalAreaYearIterator theKind = (KindAgriculturalAreaYearIterator)findAncestorWithClass(this, KindAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theKind.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

