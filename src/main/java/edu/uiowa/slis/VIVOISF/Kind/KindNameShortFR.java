package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameShortFRIterator theKind = (KindNameShortFRIterator)findAncestorWithClass(this, KindNameShortFRIterator.class);
			pageContext.getOut().print(theKind.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

