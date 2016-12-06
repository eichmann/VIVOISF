package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameOfficialARIterator theKind = (KindNameOfficialARIterator)findAncestorWithClass(this, KindNameOfficialARIterator.class);
			pageContext.getOut().print(theKind.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

