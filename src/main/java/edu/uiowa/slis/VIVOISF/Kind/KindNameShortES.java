package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameShortESIterator theKind = (KindNameShortESIterator)findAncestorWithClass(this, KindNameShortESIterator.class);
			pageContext.getOut().print(theKind.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

