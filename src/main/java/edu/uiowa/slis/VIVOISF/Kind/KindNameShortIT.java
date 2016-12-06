package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameShortITIterator theKind = (KindNameShortITIterator)findAncestorWithClass(this, KindNameShortITIterator.class);
			pageContext.getOut().print(theKind.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

