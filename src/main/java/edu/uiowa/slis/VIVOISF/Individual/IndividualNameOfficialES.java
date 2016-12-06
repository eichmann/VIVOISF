package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameOfficialESIterator theIndividual = (IndividualNameOfficialESIterator)findAncestorWithClass(this, IndividualNameOfficialESIterator.class);
			pageContext.getOut().print(theIndividual.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

