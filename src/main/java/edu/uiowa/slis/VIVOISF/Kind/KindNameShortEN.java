package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameShortENIterator theKind = (KindNameShortENIterator)findAncestorWithClass(this, KindNameShortENIterator.class);
			pageContext.getOut().print(theKind.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

