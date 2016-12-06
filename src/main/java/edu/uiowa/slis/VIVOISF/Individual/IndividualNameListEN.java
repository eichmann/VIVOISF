package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameListENIterator theIndividual = (IndividualNameListENIterator)findAncestorWithClass(this, IndividualNameListENIterator.class);
			pageContext.getOut().print(theIndividual.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

