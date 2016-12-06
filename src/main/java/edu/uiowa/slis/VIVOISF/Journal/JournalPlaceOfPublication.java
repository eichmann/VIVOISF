package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Journal theJournal = (Journal)findAncestorWithClass(this, Journal.class);
			if (!theJournal.commitNeeded) {
				pageContext.getOut().print(theJournal.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Journal theJournal = (Journal)findAncestorWithClass(this, Journal.class);
			return theJournal.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Journal for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Journal theJournal = (Journal)findAncestorWithClass(this, Journal.class);
			theJournal.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for placeOfPublication tag ");
		}
	}
}

