package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			non_self_governingNameShortENIterator thenon_self_governing = (non_self_governingNameShortENIterator)findAncestorWithClass(this, non_self_governingNameShortENIterator.class);
			pageContext.getOut().print(thenon_self_governing.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

