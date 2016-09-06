package edu.uiowa.slis.VIVOISF.TelephoneType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TelephoneTypeSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TelephoneTypeSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(TelephoneTypeSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			TelephoneType theTelephoneType = (TelephoneType)findAncestorWithClass(this, TelephoneType.class);
			if (!theTelephoneType.commitNeeded) {
				pageContext.getOut().print(theTelephoneType.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TelephoneType for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TelephoneType for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			TelephoneType theTelephoneType = (TelephoneType)findAncestorWithClass(this, TelephoneType.class);
			return theTelephoneType.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing TelephoneType for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TelephoneType for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			TelephoneType theTelephoneType = (TelephoneType)findAncestorWithClass(this, TelephoneType.class);
			theTelephoneType.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing TelephoneType for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TelephoneType for subjectURI tag ");
		}
	}
}

