package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameOfficialZHIterator theIndividual = (IndividualNameOfficialZHIterator)findAncestorWithClass(this, IndividualNameOfficialZHIterator.class);
			pageContext.getOut().print(theIndividual.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

