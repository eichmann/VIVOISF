package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntitySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntitySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntitySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntity theGeopoliticalEntity = (GeopoliticalEntity)findAncestorWithClass(this, GeopoliticalEntity.class);
			if (!theGeopoliticalEntity.commitNeeded) {
				pageContext.getOut().print(theGeopoliticalEntity.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			GeopoliticalEntity theGeopoliticalEntity = (GeopoliticalEntity)findAncestorWithClass(this, GeopoliticalEntity.class);
			return theGeopoliticalEntity.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing GeopoliticalEntity for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			GeopoliticalEntity theGeopoliticalEntity = (GeopoliticalEntity)findAncestorWithClass(this, GeopoliticalEntity.class);
			theGeopoliticalEntity.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for subjectURI tag ");
		}
	}
}

