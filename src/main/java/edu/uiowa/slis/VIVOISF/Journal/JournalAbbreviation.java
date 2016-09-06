package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Journal theJournal = (Journal)findAncestorWithClass(this, Journal.class);
			if (!theJournal.commitNeeded) {
				pageContext.getOut().print(theJournal.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Journal theJournal = (Journal)findAncestorWithClass(this, Journal.class);
			return theJournal.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Journal for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Journal theJournal = (Journal)findAncestorWithClass(this, Journal.class);
			theJournal.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for abbreviation tag ");
		}
	}
}

