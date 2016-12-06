package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameOfficialFRIterator theKind = (KindNameOfficialFRIterator)findAncestorWithClass(this, KindNameOfficialFRIterator.class);
			pageContext.getOut().print(theKind.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

