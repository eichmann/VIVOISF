package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameListRUIterator theIndividual = (IndividualNameListRUIterator)findAncestorWithClass(this, IndividualNameListRUIterator.class);
			pageContext.getOut().print(theIndividual.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

