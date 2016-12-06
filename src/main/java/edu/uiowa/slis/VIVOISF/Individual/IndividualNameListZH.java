package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameListZHIterator theIndividual = (IndividualNameListZHIterator)findAncestorWithClass(this, IndividualNameListZHIterator.class);
			pageContext.getOut().print(theIndividual.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

