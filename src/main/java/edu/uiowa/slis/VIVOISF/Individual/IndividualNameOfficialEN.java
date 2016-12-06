package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameOfficialENIterator theIndividual = (IndividualNameOfficialENIterator)findAncestorWithClass(this, IndividualNameOfficialENIterator.class);
			pageContext.getOut().print(theIndividual.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

