package edu.uiowa.slis.VIVOISF.BFO_0000020;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000020NameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000020NameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000020NameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000020NameShortENIterator theBFO_0000020 = (BFO_0000020NameShortENIterator)findAncestorWithClass(this, BFO_0000020NameShortENIterator.class);
			pageContext.getOut().print(theBFO_0000020.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000020 for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000020 for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

