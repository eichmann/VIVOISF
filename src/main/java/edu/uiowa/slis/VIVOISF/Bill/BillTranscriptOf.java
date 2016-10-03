package edu.uiowa.slis.VIVOISF.Bill;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BillTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BillTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(BillTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BillTranscriptOfIterator theBillTranscriptOfIterator = (BillTranscriptOfIterator)findAncestorWithClass(this, BillTranscriptOfIterator.class);
			pageContext.getOut().print(theBillTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Bill for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Bill for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

