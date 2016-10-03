package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperDistributorIterator theConferencePaperDistributorIterator = (ConferencePaperDistributorIterator)findAncestorWithClass(this, ConferencePaperDistributorIterator.class);
			pageContext.getOut().print(theConferencePaperDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for distributor tag ");
		}
		return SKIP_BODY;
	}
}

