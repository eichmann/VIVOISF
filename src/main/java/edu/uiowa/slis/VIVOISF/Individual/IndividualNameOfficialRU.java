package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameOfficialRUIterator theIndividual = (IndividualNameOfficialRUIterator)findAncestorWithClass(this, IndividualNameOfficialRUIterator.class);
			pageContext.getOut().print(theIndividual.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

