package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameOfficialENIterator theKind = (KindNameOfficialENIterator)findAncestorWithClass(this, KindNameOfficialENIterator.class);
			pageContext.getOut().print(theKind.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

