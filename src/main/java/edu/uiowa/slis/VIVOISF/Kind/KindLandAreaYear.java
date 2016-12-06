package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(KindLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindLandAreaYearIterator theKind = (KindLandAreaYearIterator)findAncestorWithClass(this, KindLandAreaYearIterator.class);
			pageContext.getOut().print(theKind.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

