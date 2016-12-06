package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameOfficialESIterator theKind = (KindNameOfficialESIterator)findAncestorWithClass(this, KindNameOfficialESIterator.class);
			pageContext.getOut().print(theKind.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

