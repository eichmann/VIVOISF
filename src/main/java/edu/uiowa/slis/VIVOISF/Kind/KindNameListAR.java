package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameListARIterator theKind = (KindNameListARIterator)findAncestorWithClass(this, KindNameListARIterator.class);
			pageContext.getOut().print(theKind.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

