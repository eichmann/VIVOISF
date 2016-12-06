package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Journal theJournal = (Journal)findAncestorWithClass(this, Journal.class);
			if (!theJournal.commitNeeded) {
				pageContext.getOut().print(theJournal.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Journal theJournal = (Journal)findAncestorWithClass(this, Journal.class);
			return theJournal.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Journal for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Journal theJournal = (Journal)findAncestorWithClass(this, Journal.class);
			theJournal.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hideFromDisplay tag ");
		}
	}
}

