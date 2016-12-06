package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameListFRIterator theKind = (KindNameListFRIterator)findAncestorWithClass(this, KindNameListFRIterator.class);
			pageContext.getOut().print(theKind.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

