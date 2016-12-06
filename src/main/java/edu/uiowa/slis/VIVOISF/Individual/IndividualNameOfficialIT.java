package edu.uiowa.slis.VIVOISF.Individual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndividualNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IndividualNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(IndividualNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IndividualNameOfficialITIterator theIndividual = (IndividualNameOfficialITIterator)findAncestorWithClass(this, IndividualNameOfficialITIterator.class);
			pageContext.getOut().print(theIndividual.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Individual for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Individual for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

