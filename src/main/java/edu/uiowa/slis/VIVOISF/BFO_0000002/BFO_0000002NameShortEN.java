package edu.uiowa.slis.VIVOISF.BFO_0000002;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000002NameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000002NameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000002NameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000002NameShortENIterator theBFO_0000002 = (BFO_0000002NameShortENIterator)findAncestorWithClass(this, BFO_0000002NameShortENIterator.class);
			pageContext.getOut().print(theBFO_0000002.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000002 for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000002 for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

