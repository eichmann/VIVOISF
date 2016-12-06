package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameOfficialZHIterator theKind = (KindNameOfficialZHIterator)findAncestorWithClass(this, KindNameOfficialZHIterator.class);
			pageContext.getOut().print(theKind.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

