package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameListENIterator theKind = (KindNameListENIterator)findAncestorWithClass(this, KindNameListENIterator.class);
			pageContext.getOut().print(theKind.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

