package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Legislation theLegislation = (Legislation)findAncestorWithClass(this, Legislation.class);
			if (!theLegislation.commitNeeded) {
				pageContext.getOut().print(theLegislation.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Legislation theLegislation = (Legislation)findAncestorWithClass(this, Legislation.class);
			return theLegislation.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Legislation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Legislation theLegislation = (Legislation)findAncestorWithClass(this, Legislation.class);
			theLegislation.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for subjectURI tag ");
		}
	}
}

