package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameShortENIterator theIndividual = (IndividualNameShortENIterator)findAncestorWithClass(this, IndividualNameShortENIterator.class);
			pageContext.getOut().print(theIndividual.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

