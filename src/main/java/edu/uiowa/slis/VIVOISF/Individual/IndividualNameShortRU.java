package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameShortRUIterator theIndividual = (IndividualNameShortRUIterator)findAncestorWithClass(this, IndividualNameShortRUIterator.class);
			pageContext.getOut().print(theIndividual.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

