package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameOfficialITIterator theKind = (KindNameOfficialITIterator)findAncestorWithClass(this, KindNameOfficialITIterator.class);
			pageContext.getOut().print(theKind.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

