package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameShortARIterator theKind = (KindNameShortARIterator)findAncestorWithClass(this, KindNameShortARIterator.class);
			pageContext.getOut().print(theKind.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

