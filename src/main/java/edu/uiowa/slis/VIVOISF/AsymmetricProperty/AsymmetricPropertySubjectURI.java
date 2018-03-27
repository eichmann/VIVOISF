package edu.uiowa.slis.VIVOISF.AsymmetricProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AsymmetricPropertySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AsymmetricPropertySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AsymmetricPropertySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AsymmetricProperty theAsymmetricProperty = (AsymmetricProperty)findAncestorWithClass(this, AsymmetricProperty.class);
			if (!theAsymmetricProperty.commitNeeded) {
				pageContext.getOut().print(theAsymmetricProperty.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AsymmetricProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AsymmetricProperty for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			AsymmetricProperty theAsymmetricProperty = (AsymmetricProperty)findAncestorWithClass(this, AsymmetricProperty.class);
			return theAsymmetricProperty.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing AsymmetricProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AsymmetricProperty for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			AsymmetricProperty theAsymmetricProperty = (AsymmetricProperty)findAncestorWithClass(this, AsymmetricProperty.class);
			theAsymmetricProperty.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing AsymmetricProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AsymmetricProperty for subjectURI tag ");
		}
	}
}

