package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalDistributorIterator theJournalDistributorIterator = (JournalDistributorIterator)findAncestorWithClass(this, JournalDistributorIterator.class);
			pageContext.getOut().print(theJournalDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for distributor tag ");
		}
		return SKIP_BODY;
	}
}

