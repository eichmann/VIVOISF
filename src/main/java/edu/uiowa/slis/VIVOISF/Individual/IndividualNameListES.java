package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameListESIterator theIndividual = (IndividualNameListESIterator)findAncestorWithClass(this, IndividualNameListESIterator.class);
			pageContext.getOut().print(theIndividual.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

